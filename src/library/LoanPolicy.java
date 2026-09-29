package library;

public class LoanPolicy {
    public int maxBooks(MemberType type) { return type == MemberType.STUDENT ? 3 : 5; }
}
