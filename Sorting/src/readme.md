# Number Sorting
Sorting Algorithms
This repo was created for projects within the scope of Data Structures and Algorithms training. It contains examples of Insertion Sort and Selection Sort, which are sorting algorithms. It contains one insertionsort.md file, one selectionsort.md file and one README.md file. The content information of the files is as follows.

# Selection Sort
   1.1. Operation Logic
   This algorithm is, in my opinion, the easiest sorting algorithm to think about. From the first element to the last element, we replace each element with the smallest of the following smaller elements. For example, let's imagine that we sort the following array up to the 3rd element and see what we do next.

{1, 2, 3, 10, 6, 4, 7}

As we can see, we have an array sorted up to the 3rd element. We are now looking at the 4th element, 10, and according to our rule, we need to find the smallest element after 10 that is less than 10 and replace it with 10. In this step, the number that fits this rule is 4. When we swap them, our array looks like this:

{1, 2, 3, 4, 6, 10, 7}

Now that we have looked at the third element, in the next step we look at the fourth element and apply the rule. When we continue like this until the end of the array, we have sorted the whole array.

# Insertion Sort
Operation Logic
This algorithm starts from the 2nd element of the array and replaces each element it overlaps until it reaches the last element with the elements that come before that element and are larger than that element. In this case, the elements to the left of an element will be ordered and the elements to the right will be shuffled. For example, let a = {2,4,5,3,1,6} and let a[3] = 3. As we can see, the left side of the element we are hovering over is ordered and the right side is shuffled. In this case, the algorithm will move the elements to the left of 3 that are greater than 3 to the right by one element and place 3 in the gap. If we go step by step: {2,4,5,3,1,6} -> {2,4,5,5,1,6} -> {2,4,4,5,1,6} -> {2,3,4,5,1,6}. Then we move to the next element a[4] = 1 and move it to the left to get our ordered array {1,2,3,4,5,6}. Since the last element is already the largest element in the array, no substitution is done.

# Bubble Sort

Working Logic
It's a very simple algorithm in terms of logic and coding, but when we think about how it will work, it's an algorithm that does so many operations that it can bore the processor. It starts at the beginning of the array and compares all the elements until the end with the previous element and replaces them if necessary. In this way, it scans the array over and over again until the array is completely sorted. When it realizes that the array is completely sorted, i.e. there are no more elements to replace, it stops working and the sorting is finished.





---

## Installation
Clone the project.
https://github.com/iferhatzdemir/Java_Study/tree/main/Sorting/src

---

## Usage
After cloning the project, open it with the ide you used.

---

## Requirements
* JDK (version 19 is recommended)

---

## Author
**İbrahim Ferhat Özdemir**

* GitHub: [İbrahim Ferhat Özdemir](https://github.com/iferhatzdemir)
* LinkedIn: [İbrahim Ferhat Özdemir](https://www.linkedin.com/in/ibrahim-ferhat-%C3%B6zdemir-4304b4139/
  )
---

## Contributing
Contributions, issues, and feature requests are welcome.

---

## License

[MIT](https://choosealicense.com/licenses/mit/)

---

## Show Your Suport
Give me a &#11088; if you like the project.

---

## Acknowledgments
* This repo is created for my own projects on www.patika.dev




