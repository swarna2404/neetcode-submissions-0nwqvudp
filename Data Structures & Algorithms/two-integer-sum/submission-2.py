class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
          dic={}
          for index,value in enumerate(nums):
            diff=target-value
            if diff in dic:
                return[dic[diff],index]
            dic[value]=index
