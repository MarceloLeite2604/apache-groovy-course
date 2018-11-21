enum WeekDay {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

Range weekDays = (WeekDay.SUNDAY .. WeekDay.SATURDAY)
println weekDays.size()
println weekDays.contains(WeekDay.WEDNESDAY)
println weekDays.from
println weekDays.to

List days = WeekDay.values()
println days
println days.size()
days.remove(WeekDay.SATURDAY)
days << WeekDay.SATURDAY
println days[6]

Map mapDays = [:]
for (weekDay in WeekDay.values()) {
    mapDays << [(weekDay.ordinal()):weekDay]
}

println mapDays
println mapDays.getClass().getName()
println mapDays.size()

mapDays.each { mapDayEntry ->
    println mapDayEntry.value
}