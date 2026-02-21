#include <stdio.h>
#include <stdbool.h>
#include <stdint.h>
int main() {

    printf("----------------------Basic Datatypes--------------------------\n");
   
    // 1. Integer (Typically 4 bytes)
    int age = 23;
    printf("Integer: %d\n", age); // Added label and \n

    // 2. Float (4 bytes, 6-7 decimal precision)
    float height = 5.9f; 
    printf("Float: %.1f\n", height); // %.1f limits output to 1 decimal place

    // 3. Character (1 byte)
    char firstLetterOfName = 'M';
    printf("Char: %c\n", firstLetterOfName);

    // 4. Boolean (Requires stdbool.h)
    bool KarnatakaIsACountry = false;
    printf("Boolean: %d (0=false, 1=true)\n", KarnatakaIsACountry);

    // 5. String (Character Array with null terminator \0)
    char name[] = "algorithms365";
    printf("String: %s\n", name);

    // 6. Double (8 bytes, ~15 decimal precision)
    double precise_height = 5.9123456789;
    printf("Double: %.10f\n", precise_height);

    // 7. Long Double (Typically 12 or 16 bytes)
    long double very_precise_height = 5.9123456789123456789L;
    printf("Long Double: %.18Lf\n", very_precise_height);    

    
    printf("----------------------Datatypes Modifiers--------------------------\n");
    // Unsigned Character
    unsigned char u_initial = 65;  // Unsigned character value
    printf("Unsigned Character: u_initial = %c\n", u_initial);

    // Unsigned Integer
    unsigned int unsigned_age = 30;  // Unsigned integer value
    printf("Unsigned Integer: unsigned_age = %u\n", unsigned_age);

    // Short Integer
    short int short_age = 20;  // Short integer value
    printf("Short Integer: short_age = %hd\n", short_age);

    // Unsigned Short Integer
    unsigned short int u_short_age = 35;  // Unsigned short integer value
    printf("Unsigned Short Integer: u_short_age = %hu\n", u_short_age);

    // Long Integer
    long int large_number = 1234567890;  // Long integer value
    printf("Long Integer: large_number = %ld\n", large_number);

    // Unsigned Long Integer
    unsigned long int u_large_number = 1234567890UL;  // Unsigned long integer value
    printf("Unsigned Long Integer: u_large_number = %lu\n", u_large_number);

    // 64-bit Integer
    int64_t large_int64 = 9223372036854775807;  // 64-bit integer value
    printf("64-bit Integer: large_int64 = %lld\n", large_int64);

    // Unsigned 64-bit Integer
    uint64_t u_large_int64 = 18446744073709551615U;  // Unsigned 64-bit integer value
    printf("Unsigned 64-bit Integer: u_large_int64 = %llu\n", u_large_int64);

    
}

/*
KEY NOTES:-

1. Modern C (C99 to C17)
To use bool, you must include the header <stdbool.h>.
Values: true (integer 1) and false (integer 0).
Underlying Type: It is actually a macro for _Bool, which is a small unsigned integer.
Size: Usually 1 byte, though technically it only needs to be large enough to store 0 or 1.

#include <stdbool.h>

bool isCoded = true; 
if (isCoded) {
    // Executes if true
}
Use code with caution.

2. The "New" C (C23 Standard)
In the latest C23 standard, bool, true, and false are now keywords, so you no longer need to include <stdbool.h> Wikipedia: C23.

3. Ancient C (C89 / C90)
Old-school C didn't have a boolean type. Programmers used int:
0 was treated as false.
Any non-zero value (usually 1) was treated as true.


*/