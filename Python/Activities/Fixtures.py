import pytest

@pytest.fixture
def num_list() :

    #Create a list
    list = [0,1,2,3,4,5,6,7,8,9,10]
    return list

# Test method
def testSum(num_list) :
    sum = 0
    for n in num_list :
        sum += n

    assert sum == 55

