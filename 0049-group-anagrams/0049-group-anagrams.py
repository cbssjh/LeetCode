class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # 알파벳 순으로 정렬
        dict=defaultdict(list)
        for i in strs:
            si=''.join(sorted(i))
            dict[si].append(i)

        ans=[]

        for j in dict.keys():
            elm=dict[j]
            ans.append(elm)

        # 그냥 list(dict.values()) 하면 됨
        
        return ans
    # 참조 : https://blog.naver.com/rkttndk/222845133957


        