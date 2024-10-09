// String Operations
#include <stdio.h>
#include <string.h>

int findLength(char str1[]);
void compareStrings(char str1[], char str2[]);

int main() {
    int choice;
    char str1[50], str2[50];
    
    do {
        printf("\nMenu:\n");
        printf("1. Enter two strings\n");
        printf("2. Compare the strings\n");
        printf("3. Find length of the first string\n");
        printf("4. Concatenate second string to the first string\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        getchar();  // To consume the newline character after scanf
        
        switch(choice) {
            case 1:
                printf("Enter the first string: ");
                fgets(str1, sizeof(str1), stdin);
                str1[strcspn(str1, "\n")] = '\0'; // Remove newline character if present
                
                printf("Enter the second string: ");
                fgets(str2, sizeof(str2), stdin);
                str2[strcspn(str2, "\n")] = '\0'; // Remove newline character if present
                break;
                
            case 2:
                compareStrings(str1, str2);
                break;
                
            case 3:
                printf("Length of the first string = %d\n", findLength(str1));
                break;
                
            case 4:
                {
                    int i, j;
                    i = findLength(str1);
                    j = 0;
                    
                    while (str2[j] != '\0') {
                        str1[i] = str2[j];
                        i++;
                        j++;
                    }
                    str1[i] = '\0';
                    
                    printf("Concatenated string = %s\n", str1);
                }
                break;
                
            case 5:
                printf("Exiting...\n");
                break;
                
            default:
                printf("Invalid choice. Please try again.\n");
                break;
        }
    } while (choice != 5);
    
    return 0;
}

int findLength(char str1[]) {
    int i = 0;
    while (str1[i] != '\0') {
        i++;
    }
    return i;
}

void compareStrings(char str1[], char str2[]) {
    int i = 0;
    while (str1[i] != '\0' && str2[i] != '\0') {
        if (str1[i] != str2[i]) {
            printf("%s and %s are not equal...\n", str1, str2);
            return;
        }
        i++;
    }
    if (str1[i] == '\0' && str2[i] == '\0') {
        printf("%s and %s are equal...\n", str1, str2);
    } else {
        printf("%s and %s are not equal...\n", str1, str2);
    }
}