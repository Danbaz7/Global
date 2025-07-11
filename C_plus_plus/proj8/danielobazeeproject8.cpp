//Author: Daniel Obazee
//Date:11-24-2024
//CSSI 121 PROJECT 8
#include <iostream>
#include <vector>
#include <string>
#include <cctype>
#include <iomanip>

using namespace std;

// Function prototypes
void get_scores(vector<int> &v);
// get integer scores from keyboard and store in v.
// we assume that the user will input scores in range
// of 0 to 100, inclusive. User enter a negative
// number to stop the input and end the function
void print_stats(const vector<int> &v);
// print out the stats of data that are stored in v
// includes: max, min, total number of data,
// and the average
bool is_palindrome(string sentence);
// return true if the sentence is a palindrome;
// false otherwise

int main() {
    char try_again;

    do {
        vector<int> scores; // Initialize a new vector for each set of scores
        get_scores(scores);
        print_stats(scores);
        cout << "Do you want to try another set of scores? Y/N: ";
        cin >> try_again;
        cin.ignore(); // To ignore the newline character after the choice input
    } while (try_again == 'Y' || try_again == 'y');

    do {
        string sentence;
        cout << "Enter a sentence: ";
        getline(cin, sentence);
        if (is_palindrome(sentence)) {
            cout << "\"" << sentence << "\" is a palindrome\n";
        } else {
            cout << "\"" << sentence << "\" is not a palindrome\n";
        }
        cout << "Do you want to try another sentence? Y/N: ";
        cin >> try_again;
        cin.ignore(); // To ignore the newline character after the choice input
    } while (try_again == 'Y' || try_again == 'y');

    return 0;
}

void get_scores(vector<int> &v) {
    int score;
    cout << "Enter scores, enter -1 to stop:\n";
    while (true) {
        cin >> score;
        if (score == -1) break;
        if (score >= 0 && score <= 100) {
            v.push_back(score);
        } else {
            cout << "Invalid score. Please enter a score between 0 and 100.\n";
        }
    }
}

void print_stats(const vector<int> &v) {
    if (v.empty()) {
        cout << "There are no scores.\n";
        return;
    }

    int max_score = v[0];
    int min_score = v[0];
    int sum = 0;

    for (int score : v) {
        if (score > max_score){
          max_score = score;
          }
        if (score < min_score){ 
            min_score = score;
          }
        sum += score;
    }

    double average = static_cast<double>(sum) / v.size();

    cout << "There are total " << v.size() << " scores\n";
    cout << "The highest score is: " << max_score << "\n";
    cout << "The lowest score is: " << min_score << "\n";
    cout << "The average score is: " << fixed << setprecision(4) << average << "\n";
}

bool is_palindrome(string sentence) {
    string filtered;
    for (char c : sentence) {
        if (isalnum(c)) {
            filtered += tolower(c); //This part of the function creates a new string filtered
                                    // that contains only the alphanumeric characters from sentence,
                                    //all converted to lowercase.
        }
    }

    int start = 0;
    int end = filtered.size() - 1;

    while (start < end) {
        if (filtered[start] != filtered[end]) {
            return false;
        }
        start++;
        end--;
    }

    return true;
}
