import operator

def most_frequent(input_str):
    freq = {}
    for i in input_str:
        if i in freq:
            freq[i] += 1
        else:
            freq[i] = 1
            
    sorted_d = dict(sorted(freq.items(),key=operator.itemgetter(1),reverse=True))
    print("Dictionary in descending order by values:",sorted_d)


input_str = input("Enter the string")

most_frequent(input_str)
