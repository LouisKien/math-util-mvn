/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.louis.mathutil.core.test;

import static org.louis.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author louis
 */
public class MathUtilityAdvanvedTest {

    // tạo mảng 2 chiều chứa data sẽ dùng cho việc assertE()
    // gồm n đưa vào và expected trả về
    // int          long -> Object (wrapper class)
    //                              Integer Long
    public static Object[][] initTestData() {
        Object testData[][]  = {{0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {5, 1200}};
        return testData;
    }
    // nhồi data này vào hàm assertE()
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
        //assertEquals(69,69);
        assertEquals(expected, getFactorial(n));
    }

}

/*
TDD: Test Driven Development là kĩ thuật lập trình mà gắn với việc viết các test case để kiểm thử
    ngay những hàm mà dev vừa viết
    Viết code chinh và viết code test (JUnit, Unit Test) xen kẽ với nhau, 2 màu xanh đỏ LIÊN TỤC XẢY RA

DDT: Sự mở rộng thêm cho quá trình viết code test (JUnit)
    Data Driven Testing
    kĩ thuật tách toàn bộ test data ra 1 chỗ riêng, tách vào mảng, tách vào file excel, hay table;
    sau đó nhồi/fill/map cái data từ mảng này vào trong hàm so sánh assertEquals()
    giúp code dễ đọc hơn, dễ kiểm tra xem còn thiếu test case nào hay không
*/