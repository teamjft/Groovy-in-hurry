println  "${[1,[2,3]].flatten()}"
println  "${[1,2,3].intersect([4,3,1])}"
println  "${[1,2,3].disjoint([4,5,6])}"
def list = ['1', '2', '3']
popped= list.pop()
println popped
list == [1,2]
println  "${[1,2].reverse()}"
println  "${[3,1,2].sort()}"
list = [[1,0], [0,1,2]]
list = list.sort { a,b -> a[0] <=> b[0] }
println list 
list = list.sort { item -> item.size() }
println list

def doubled = [1,2,3].collect{ item ->
item*2
}
println doubled
def odd = [1,2,3].findAll{ item ->
item % 2 == 1
}
println odd
