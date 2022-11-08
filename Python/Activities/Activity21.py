# Calculatore Test

import pytest

def test_addition() :
    num1 = 20
    num2 = 40

    sum = num1+num2
    assert sum == 60

def test_substraction() :
    num1 = 40
    num2 = 15

    diff = num1-num2
    assert diff == 25

@pytest.mark.activity
def test_multiplication() :
    num1 = 2
    num2 = 15

    prod = num1*num2
    assert prod == 30

@pytest.mark.activity
def test_division() :
    num1 = 10
    num2 = 2

    quot = num1/num2
    assert quot == 5