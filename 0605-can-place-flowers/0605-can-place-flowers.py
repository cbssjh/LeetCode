class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        answer = False
        numFlowerbed = len(flowerbed)
        for i in range(numFlowerbed):
            if flowerbed[i] == 0 and (i == 0 or flowerbed[i-1] == 0) and (i == len(flowerbed)-1 or                              flowerbed[i+1] == 0):
                flowerbed[i] = 1
                n -= 1
            if n <= 0:
                answer = True
                
        return answer
        