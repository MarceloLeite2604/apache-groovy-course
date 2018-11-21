User zach = new User(id: 1, first: "Zach", last: "Goodwing")
User mabel = new User(id: 3, first: "Mabel", last: "Arch")
User frank = new User(id: 2, first: "Frank", last: "Mason")
List<User> users = [zach, mabel, frank]
println "Unsorted: $users"
println "Sorted by id: ${users.toSorted()}"
println zach.hashCode()