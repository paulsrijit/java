public class Test 
{ 
    public void foo() 
    {
        assert false; /* Line 5 */
        assert false; /* Line 6 */
    } 
    public void bar()
    {
        while(true)
        {
            assert false; /* Line 12 */
            break;//Line 14 becomes unreachable if break statement is not there.
        } 
        assert false;  /* Line 14 */
    } 
}