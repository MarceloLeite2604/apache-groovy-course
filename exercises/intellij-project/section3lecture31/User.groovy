import groovy.transform.Canonical
import groovy.transform.Sortable

@Sortable
@Canonical
class User {
    int id
    String first
    String last

    void isUserExpired() {}
}