# Amazing Numbers

We use numbers every day. But do you know how many different properties they have? Let's take a look at some of the amazing properties of numbers. The program knows how to determine whether a number is Palindromic or Gapful, or how to distinguish Spy numbers from others. Numbers can be fascinating!

## Example
The greater-than symbol followed by a space (> ) represents the user input. Notice that it's not part of the input.

<pre>
Welcome to Amazing Numbers!

Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be printed;
- two natural numbers and properties to search for;
- a property preceded by minus must not be present in numbers;
- separate the parameters with one space;
- enter 0 to exit.

Enter a request: > 13

Properties of 13
        buzz: false
        duck: false
 palindromic: false
      gapful: false
         spy: false
      square: false
       sunny: false
     jumping: false
        even: false
         odd: true
       happy: true
         sad: false

Enter a request: > 14

Properties of 14
        buzz: true
        duck: false
 palindromic: false
      gapful: false
         spy: false
      square: false
       sunny: false
     jumping: false
        even: true
         odd: false
       happy: false
         sad: true

Enter a request: > 17

Properties of 17
        buzz: true
        duck: false
 palindromic: false
      gapful: false
         spy: false
      square: false
       sunny: false
     jumping: false
        even: false
         odd: true
       happy: false
         sad: true

Enter a request: > 7

Properties of 7
        buzz: true
        duck: false
 palindromic: true
      gapful: false
         spy: true
      square: false
       sunny: false
     jumping: true
        even: false
         odd: true
       happy: true
         sad: false

Enter a request: > -76

The first parameter should be a natural number or zero.

Enter a request: > 15

Properties of 15
        buzz: false
        duck: false
 palindromic: false
      gapful: false
         spy: false
      square: false
       sunny: true
     jumping: false
        even: false
         odd: true
       happy: false
         sad: true

Enter a request: > 102

Properties of 102
        buzz: false
        duck: true
 palindromic: false
      gapful: false
         spy: false
      square: false
       sunny: false
     jumping: false
        even: true
         odd: false
       happy: false
         sad: true

Enter a request: > 9223372036854775807

Properties of 9223372036854775807
        buzz: true
        duck: true
 palindromic: false
      gapful: false
         spy: false
      square: false
       sunny: false
     jumping: false
        even: false
         odd: true
       happy: false
         sad: true

Enter a request: > 101

Properties of 101
        buzz: false
        duck: true
 palindromic: true
      gapful: false
         spy: false
      square: false
       sunny: false
     jumping: true
        even: false
         odd: true
       happy: false
         sad: true

Enter a request: > -56

The first parameter should be a natural number or zero.

Enter a request: > 7881

Properties of 7881
        buzz: false
        duck: false
 palindromic: false
      gapful: true
         spy: false
      square: false
       sunny: false
     jumping: false
        even: false
         odd: true
       happy: false
         sad: true

Enter a request: > 7880

Properties of 7880
        buzz: false
        duck: true
 palindromic: false
      gapful: false
         spy: false
      square: false
       sunny: false
     jumping: false
        even: true
         odd: false
       happy: false
         sad: true

Enter a request: > 105 5

             105 is buzz, duck, gapful, odd, sad
             106 is duck, even, sad
             107 is buzz, duck, odd, sad
             108 is duck, gapful, even, sad
             109 is duck, odd, happy

Enter a request: > exit

The first parameter should be a natural number or zero.

Enter a request: 

Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be printed;
- two natural numbers and properties to search for;
- a property preceded by minus must not be present in numbers;
- separate the parameters with one space;
- enter 0 to exit.

Enter a request: > 9

Properties of 9
        buzz: false
        duck: false
 palindromic: true
      gapful: false
         spy: true
      square: true
       sunny: false
     jumping: true
        even: false
         odd: true
       happy: false
         sad: true

Enter a request: > 9 7

             9 is palindromic, spy, square, jumping, odd, sad
             10 is duck, jumping, even, happy
             11 is palindromic, odd, sad
             12 is jumping, even, sad
             13 is odd, happy
             14 is buzz, even, sad
             15 is sunny, odd, sad

Enter a request: > 99 9 spy

             123 is spy, jumping, odd, sad
             132 is gapful, spy, even, sad
             213 is spy, odd, sad
             231 is buzz, gapful, spy, odd, sad
             312 is spy, even, sad
             321 is spy, jumping, odd, sad
             1124 is spy, even, sad
             1142 is spy, even, sad
             1214 is spy, even, sad

Enter a request: > 9 3 drake

The property [DRAKE] is wrong.
Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]

Enter a request: > 9 3 duck

             10 is duck, jumping, even, happy
             20 is duck, even, sad
             30 is duck, even, sad

Enter a request: > bye

The first parameter should be a natural number or zero.

Enter a request: > 1

Properties of 1
        buzz: false
        duck: false
 palindromic: true
      gapful: false
         spy: true
      square: true
       sunny: false
     jumping: true
        even: false
         odd: true
       happy: true
         sad: false

Enter a request: > 1 8 square

             1 is palindromic, spy, square, jumping, odd, happy
             4 is palindromic, spy, square, jumping, even, sad
             9 is palindromic, spy, square, jumping, odd, sad
             16 is square, even, sad
             25 is square, odd, sad
             36 is square, even, sad
             49 is buzz, square, odd, happy
             64 is square, even, sad

Enter a request: > 1 7 sunny

             3 is palindromic, spy, sunny, jumping, odd, sad
             8 is palindromic, spy, sunny, jumping, even, sad
             15 is sunny, odd, sad
             24 is sunny, even, sad
             35 is buzz, sunny, odd, sad
             48 is sunny, even, sad
             63 is buzz, sunny, odd, sad

Enter a request: > 1 7 sunny square

The request contains mutually exclusive properties: [SQUARE, SUNNY]
There are no numbers with these properties.

Enter a request: > 1 2 sunny polindromic

The property [POLINDROMIC] is wrong.
Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]

Enter a request: > 1 2 sunny palindromic

             3 is palindromic, spy, sunny, jumping, odd, sad
             8 is palindromic, spy, sunny, jumping, even, sad

Enter a request: > 1234567890

Properties of 1234567890
        buzz: false
        duck: true
 palindromic: false
      gapful: true
         spy: false
      square: false
       sunny: false
     jumping: false
        even: true
         odd: false
       happy: false
         sad: true

Enter a request: > 1234567890 4

             1234567890 is duck, gapful, even, sad
             1234567891 is odd, sad
             1234567892 is even, sad
             1234567893 is gapful, odd, sad

Enter a request: > 1234567890 4 jumping

             1234567898 is jumping, even, sad
             2101010101 is duck, jumping, odd, sad
             2101010121 is buzz, duck, gapful, jumping, odd, happy
             2101010123 is duck, jumping, odd, sad

Enter a request: > 5000 5 duck spy

The request contains mutually exclusive properties: [DUCK, SPY]
There are no numbers with these properties.

Enter a request: > 5000 5 duck jumping

             10101 is buzz, duck, palindromic, jumping, odd, sad
             10121 is duck, jumping, odd, happy
             10123 is duck, jumping, odd, sad
             12101 is duck, jumping, odd, happy
             21010 is duck, jumping, even, sad

Enter a request: > 999 6 jumping odd palindromic

             10101 is buzz, duck, palindromic, jumping, odd, sad
             12121 is palindromic, jumping, odd, sad
             12321 is palindromic, square, jumping, odd, happy
             32123 is buzz, palindromic, jumping, odd, sad
             32323 is palindromic, jumping, odd, sad
             34343 is palindromic, jumping, odd, sad

Enter a request: > 1 5 hot sunny

The property [HOT] is wrong.
Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]

Enter a request: > 1 10

             1 is palindromic, spy, square, jumping, odd, happy
             2 is palindromic, spy, jumping, even, sad
             3 is palindromic, spy, sunny, jumping, odd, sad
             4 is palindromic, spy, square, jumping, even, sad
             5 is palindromic, spy, jumping, odd, sad
             6 is palindromic, spy, jumping, even, sad
             7 is buzz, palindromic, spy, jumping, odd, happy
             8 is palindromic, spy, sunny, jumping, even, sad
             9 is palindromic, spy, square, jumping, odd, sad
             10 is duck, jumping, even, happy

Enter a request: > 1 5 -odd

             2 is palindromic, spy, jumping, even, sad
             4 is palindromic, spy, square, jumping, even, sad
             6 is palindromic, spy, jumping, even, sad
             8 is palindromic, spy, sunny, jumping, even, sad
             10 is duck, jumping, even, happy

Enter a request: > 1 5 -even

             1 is palindromic, spy, square, jumping, odd, happy
             3 is palindromic, spy, sunny, jumping, odd, sad
             5 is palindromic, spy, jumping, odd, sad
             7 is buzz, palindromic, spy, jumping, odd, happy
             9 is palindromic, spy, square, jumping, odd, sad

Enter a request: > 1 5 -odd -even gapful

The request contains mutually exclusive properties: [-ODD, -EVEN]
There are no numbers with these properties.

Enter a request: > 1 5 odd square -odd

The request contains mutually exclusive properties: [-ODD, ODD]
There are no numbers with these properties.

Enter a request: > 1 5 sunny square

The request contains mutually exclusive properties: [SQUARE, SUNNY]
There are no numbers with these properties.

Enter a request: > 1 5 -sunny -square

             2 is palindromic, spy, jumping, even, sad
             5 is palindromic, spy, jumping, odd, sad
             6 is palindromic, spy, jumping, even, sad
             7 is buzz, palindromic, spy, jumping, odd, happy
             10 is duck, jumping, even, happy

Enter a request: > 2000 5 happy

             2003 is duck, odd, happy
             2008 is duck, even, happy
             2019 is duck, odd, happy
             2026 is duck, even, happy
             2030 is buzz, duck, even, happy

Enter a request: > 1 5 even sunny happy -duck -gapful

             3968 is sunny, even, happy
             34224 is sunny, even, happy
             75624 is sunny, even, happy
             134688 is sunny, even, happy
             178928 is sunny, even, happy

Enter a request: > 1 5 EVEN duck SpY

The request contains mutually exclusive properties: [DUCK, SPY]
There are no numbers with these properties.

Enter a request: > 1 5 EVEN duck SunNy

             80 is duck, sunny, even, sad
             120 is duck, gapful, sunny, even, sad
             360 is duck, gapful, sunny, even, sad
             440 is duck, gapful, sunny, even, happy
             840 is buzz, duck, sunny, even, sad

Enter a request: > 1 5 spy -duck spy sad

             2 is palindromic, spy, jumping, even, sad
             3 is palindromic, spy, sunny, jumping, odd, sad
             4 is palindromic, spy, square, jumping, even, sad
             5 is palindromic, spy, jumping, odd, sad
             6 is palindromic, spy, jumping, even, sad

Enter a request: 1 -1

The second parameter should be a natural number.

Enter a request: > 0

Goodbye!
</pre>