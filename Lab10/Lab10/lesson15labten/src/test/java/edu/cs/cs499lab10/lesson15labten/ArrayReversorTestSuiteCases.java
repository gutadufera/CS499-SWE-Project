package edu.cs.cs499lab10.lesson15labten;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import edu.cs.cs499lab10.lesson15labten.q7.ArrayReversorForNullTest;
import edu.cs.cs499lab10.lesson15labten.q7.ArrayReversorTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ArrayReversorTest.class, ArrayReversorForNullTest.class})
public class ArrayReversorTestSuiteCases {
}
