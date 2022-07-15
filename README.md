# CheckDigitsTestSuite
SDEV 1060 Project. 

In this project, you will create the methods for calculation, and the test methods, using runners for each test method. You can use the same data for all tests; all the tests can go in the same test file.  

The project uses 4 input numbers, which are doubles between the ranges of -100 and 100, not inclusive (so -100 and 100 are not part of the valid numbers). The methods that perform calculations will determine the total of the 4 numbers, the average of the 4 numbers, the largest number, and the smallest number.  

To help visualize the project, here is an example of what the project's output might look like. Note that you do not have to write the code that creates this output. You will write the methods that have to be tested, and the test methods. There are 4 methods to be tested -- calculating the total of 4 numbers, calculating the average of 4 numbers, finding the largest of 4 numbers, and finding the smallest of 4 numbers.

Begin by creating a table of test cases. It needs to include all positive numbers, all negative numbers, and combinations of positive and negative, in at least 10 test cases per method. When testing the largest number and smallest number methods, it needs to find the largest number in each of the 4 positions, and find the smallest number in each of the 4 positions. For example, the largest number needs to be the first value in one test, the second value in another test, the third value in another test, and the fourth value in another test.

The table of test cases will be large, at least 40 cases (at least 10 for each of 4 methods). Please identify the reason for each test case -- like "tests smallest in first position", "tests largest in first position", and so on.

How do you determine the expected value in the tests? One way to test that is to perform the appropriate logic in the test; another way is to put the answer into the data set the runner will use. For total and average, it is easy to code the appropriate logic in the test; for largest and smallest, that is doable but repeats code which doesn't truly test if that code is correct. In this project, do the math for total and average within the test method. For largest and smallest, determine the correct result in the test cases and include those values to the data in the test runner.  You will need 6 values to test the largest and smallest values: the 4 input values and the 2 answers for largest and smallest.

Run the test file with all tests in it, and take a screenshot of the successful results. Take screenshots of the code for each method being tested, and the code of the tests 

Submission: specified screenshots and the root folder for the project

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
