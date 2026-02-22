def greet(name: str) -> None:
    print(f"Hello, {name}!")

def maxOfthreeNumbers():
    a,b,c=40,80,30
    if a>b:
        if a>c:
            print("A is Greater")
        else:
            print("C is Greater")
    elif c>b:
        print("C is Greater")
    else:
        print("B is Greater")

def reverseString(String:str) ->str:
    reverse=""
    size=len(String)-1
    while(size>=0):
        reverse+=String[size]
        size-=1
    return reverse

def is_prime(n: int) -> bool:
    if n < 2: return False
    if n == 2 or n == 3: return True
    if n % 2 == 0 or n % 3 == 0: return False
    
    # Check 6k +/- 1 pattern (skips 2/3 of all numbers)
    # i = 5
    # while i * i <= n:
    #     if n % i == 0 or n % (i + 2) == 0:
    #         return False
    #     i += 6
    # return True
    for i in range(5,(int)(n**0.5)+1,6):
        if n%i==0 or n%(i+2):
            return False
    return True


''' 
__name__ is a special built-in variable in Python. It holds the name of the module. If a Python script is being run directly, 
__name__ is set to `'__main__'`. If it is being imported into another script, __name__ will be the module's name.

'''
if __name__ == "__main__":
    # pass
    # greet("Alice")
    # maxOfthreeNumbers()
    # reverse=reverseString("Hello")
    # print(reverse)
    print(is_prime(11))