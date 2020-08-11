package edu.cs.cs499lab10.lesson15labten;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import edu.cs.cs499lab10.lesson15labten.q6.ArrayFlattenerNullTest;
import edu.cs.cs499lab10.lesson15labten.q6.ArrayFlattenerTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({ArrayFlattenerTest.class, ArrayFlattenerNullTest.class})
public class ArrayFlatternerTestSuiteCase {
}

