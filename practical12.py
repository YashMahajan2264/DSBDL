import re

def separate_words(paragraph):
    # Remove punctuation marks and convert to lowercase
    clean_paragraph = re.sub(r'[^\w\s]', '', paragraph.lower())

    # Split the paragraph into words
    words = clean_paragraph.split()

    # Count occurrences of each word
    word_counts = {}
    for word in words:
        if word in word_counts:
            word_counts[word] += 1
        else:
            word_counts[word] = 1

    # Separate repeated and non-repeated words
    repeated_words = []
    non_repeated_words = []
    for word, count in word_counts.items():
        if count > 1:
            repeated_words.append(word)
        else:
            non_repeated_words.append(word)

    return repeated_words, non_repeated_words

# Example usage:
paragraph = "This is a sample paragraph. This paragraph contains some sample words. Sample words are used for counting."
repeated, non_repeated = separate_words(paragraph)
print("Repeated words:", repeated)
print("Non-repeated words:", non_repeated)
