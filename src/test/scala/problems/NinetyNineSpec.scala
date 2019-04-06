package problems

import org.scalatest._

class NinetyNineSpec extends FlatSpec with Matchers {

  import NinetyNine._

  "lastElement" should "return the last element of a list" in {
    lastElement(List(1, 1, 2, 3, 5, 8)) should be(8)
    lastElement(List(1, 2, 3, 4, 5)) should be(5)
    lastElement(('a' to 'z').toList) should be('z')
    lastElement(List("adam", "austin", "is", "no", "good")) should be("good")

    assertThrows[NoSuchElementException] {
      lastElement(List())
    }
  }

  "secondLastElement" should "return the second last element in a list" in {
    secondLastElement(List(1, 1, 2, 3, 5, 8)) should be(5)
    secondLastElement((1 to 10).toList) should be(9)
    secondLastElement(('a' to 'z').toList) should be('y')
    secondLastElement(List("adam", "austin", "is", "no", "good")) should be("no")

    assertThrows[NoSuchElementException] {
      secondLastElement(List())
    }
  }

  "kthElement" should "return the kth element from a list" in {
    kthElement(List(1, 1, 2, 3, 5, 8), 2) should be(2)
    kthElement((1 to 10).toList, 3) should be(4)
    kthElement(('a' to 'z').toList, 7) should be('h')

    assertThrows[NoSuchElementException] {
      kthElement(List(), 0)
    }
  }

  "listLength" should "return the length of a list" in {
    listLength((1 to 10).toList) should be(10)
    listLength(('a' to 'z').toList) should be(26)
    listLength(List()) should be(0)
    listLength(List(('a' to 'z').toList, (1 to 10).toList)) should be(2)
  }

  "reverseList" should "return a list with elements reversed" in {
    reverseList((1 to 10).toList) should be(List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1))
    reverseList(List('a', 'b', 'c')) should be(List('c', 'b', 'a'))
    reverseList(List(List('a', 'b'), List(1, 2, 3))) should be(List(List(1, 2, 3), List('a', 'b')))
    reverseList(List()) should be(List())

  }

  "isPalindrome" should "determine palindromes correctly" in {
    isPalindrome(List(1, 2, 3, 2, 1)) should be(true)
    isPalindrome(List()) should be(true)
    isPalindrome(List(1)) should be(true)
    isPalindrome(List(1, 1)) should be(true)
    isPalindrome(List(1, 2)) should be(false)
    isPalindrome(List(1, 2, 1, 1)) should be(false)
    isPalindrome((1 to 50).toList ++ (1 to 50).reverse.toList) should be(true)
  }

  "flattenList" should "determine palindromes correctly" in {
    flattenList(List(List(1, 1), 2, List(3, List(5, 8)))) should be(List(1, 1, 2, 3, 5, 8))
    flattenList(List(List(8, List(7), List(6), List(List(5), List(4, List(3)))))) should be(List(8, 7, 6, 5, 4, 3))
    flattenList(List(List(), List(List()))) should be(List())
  }


}

