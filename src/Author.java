import java.util.Objects;

public class Author {
    private String nameFirst;
    private String nameLast;

    public Author(String nameFirst, String nameLast) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    @Override
    public boolean equals(Object isEquals) {
        if (isEquals == null || getClass() != isEquals.getClass()) return false;
        Author author = (Author) isEquals;
        return Objects.equals(nameFirst, author.nameFirst) && Objects.equals(nameLast, author.nameLast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFirst, nameLast);
    }

    @Override
    public String toString() {
        return nameFirst + " " + nameLast;
    }
}
