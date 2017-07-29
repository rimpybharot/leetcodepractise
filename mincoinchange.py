'''
Created on Jul 27, 2017

@author: rimpy
'''
from builtins import range


def main():
    
    coinValList = [1,2];
    Amount = 101;
    print(makeChange(coinValList, Amount))

def makeChange(coinValList, Amount):
    
    minCoins = [-1]*(Amount+1);
    
    minCoins[0] = 0;
    
    for amt in range(1, Amount+1):
        
        for coin in coinValList:
            if(coin<=amt):
                tempCoins = minCoins[amt-coin]
                if(tempCoins!=-1 and (minCoins[amt]==-1 or minCoins[amt]>tempCoins)):
                    minCoins[amt] = tempCoins + 1       
        
    
        
    
    return minCoins[Amount]
    
main();
