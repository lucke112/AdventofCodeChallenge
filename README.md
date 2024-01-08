# Advent of Code Challenge

Advent of Code Challenge is an Advent calendar of small programming puzzles for a variety of skill sets and skill levels that can be solved in any programming language you like. In this repository the diffrent challenges have been solved using Java for the 2023 challenge. 

For more information check out: https://adventofcode.com/2023/about 

## Challenges
There are in total of 25 challenges that all have two parts of a problem that needs to be solved. The first problem is usually the easier problem and when completed you get the chance to tackle the secound problem that is harder. If you haven't cleared the first part you wont be able to advance to the secound part of the daily challenge. To clearify a bit the challenges you can do in any order you like and whenever you want. But the secound part that are a part of a challenge can only be accessed when the first part of the challenge have been cleared. For all of these challenges you get input data that you will use to solve the problem. 

Here is a link to the calender: https://adventofcode.com/2023

### Challenge Day 1
#### Part 1
In this task, you are given a calibration document consisting of lines of text, where each line contains a specific calibration value that needs to be recovered. The calibration value for each line is formed by combining the first digit and the last digit of that line, in that order, to create a two-digit number. Your goal is to calculate the sum of all these calibration values across the entire document. The task involves parsing the text lines, extracting the first and last digits from each line, converting them into two-digit numbers, and then summing up all these values to obtain the final result.

For example:

**1abc2**

**pqr3stu8vwx**

**a1b2c3d4e5f**

**treb7uchet**

In this example, the calibration values for each line are as follows:

Line 1: 12 (1 as the first digit and 2 as the last digit)

Line 2: 38 (p as the first digit and x as the last digit)

Line 3: 15 (a as the first digit and f as the last digit)

Line 4: 77 (t as the first digit and t as the last digit)

Adding these values together produces the sum: 12 + 38 + 15 + 77 = 142. Therefore, the answer to the question "What is the sum of all of the calibration values?" is 142 (In this example!, not the actual task).

#### Part 2
In this follow-up task, the approach to finding the calibration values needs to be adjusted. Digits may be spelled out with letters, so you need to consider words like "one," "two," etc., as valid digits.

For example:

**two1nine**

**eightwothree**

**abcone2threexyz**

**xtwone3four**

**4nineeightseven2**

**zoneight234**

**7pqrstsixteen**

In this example, the calibration values are 29, 83, 13, 24, 42, 14, and 76. Adding these together produces 281.
