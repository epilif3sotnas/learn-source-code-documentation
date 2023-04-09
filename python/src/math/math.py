class Math(object):

    def __init__(self) -> object: pass

    def fibonacci(self, num: int) -> int:
        if not isinstance(num, int):
            return -1
        
        if num <= 0:
            return 0
        
        if num == 1:
            return 1
        
        fibonacci: list = [0,1]
        for i in range(2, num + 1):
            sum = fibonacci[i - 1] + fibonacci[i - 2]
            fibonacci.append(sum)
        
        return fibonacci[-1]
    
    def square(self, num: int) -> int:
        if not isinstance(num, int):
            return -1
        
        return num * num