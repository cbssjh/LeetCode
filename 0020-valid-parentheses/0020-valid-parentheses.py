class Solution(object):
    def isValid(self, s):
        stack=[]
        brackets={'}':'{',')':'(',']':'['}
        
        for bracket in s:
            #opened bracket
            if bracket in brackets.values(): 
                stack.append(bracket)
            #closed bracket    
            else:
                if stack and brackets[bracket]==stack[-1] :  
                    stack.pop()
                else: 
                    return False
        
        if stack:
            return False
        return True
        