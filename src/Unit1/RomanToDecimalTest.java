package Unit1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToDecimalTest {


    @Test
    public void romanToDecimalTest(){
        assertEquals(RomanToDecimal.romanToDecimal("I"),1);
        assertEquals(RomanToDecimal.romanToDecimal("i"),1);
        assertEquals(RomanToDecimal.romanToDecimal("II"),2);
        assertEquals(RomanToDecimal.romanToDecimal("ii"),2);
        assertEquals(RomanToDecimal.romanToDecimal("III"),3);
        assertEquals(RomanToDecimal.romanToDecimal("iii"),3);
        assertEquals(RomanToDecimal.romanToDecimal("IV"),4);
        assertEquals(RomanToDecimal.romanToDecimal("iv"),4);
        assertEquals(RomanToDecimal.romanToDecimal("V"),5);
        assertEquals(RomanToDecimal.romanToDecimal("v"),5);
        assertEquals(RomanToDecimal.romanToDecimal("VI"),6);
        assertEquals(RomanToDecimal.romanToDecimal("vi"), 6);
        assertEquals(RomanToDecimal.romanToDecimal("VII"),7);
        assertEquals(RomanToDecimal.romanToDecimal("vii"),7);
        assertEquals(RomanToDecimal.romanToDecimal("VIII"),8);
        assertEquals(RomanToDecimal.romanToDecimal("viii"),8);
        assertEquals(RomanToDecimal.romanToDecimal("IX"), 9);
        assertEquals(RomanToDecimal.romanToDecimal("ix"), 9);
        assertEquals(RomanToDecimal.romanToDecimal("X"),10);
        assertEquals(RomanToDecimal.romanToDecimal("x"), 10);
        assertEquals(RomanToDecimal.romanToDecimal("XI"), 11);
        assertEquals(RomanToDecimal.romanToDecimal("XI"),11);
        assertEquals(RomanToDecimal.romanToDecimal("XIV"),14);
        assertEquals(RomanToDecimal.romanToDecimal("xiv"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("XV"), 15);
        assertEquals(RomanToDecimal.romanToDecimal("xv"), 15);
        assertEquals(RomanToDecimal.romanToDecimal("XIX"),19);
        assertEquals(RomanToDecimal.romanToDecimal("xix"), 19);
        assertEquals(RomanToDecimal.romanToDecimal("XXIX"), 29);
        assertEquals(RomanToDecimal.romanToDecimal("xxix"), 29);
        assertEquals(RomanToDecimal.romanToDecimal("XXXIV"), 34);
        assertEquals(RomanToDecimal.romanToDecimal("xxxiv"), 34);
        assertEquals(RomanToDecimal.romanToDecimal("XLIX"), 49);
        assertEquals(RomanToDecimal.romanToDecimal("xlix"), 49);
        assertEquals(RomanToDecimal.romanToDecimal("LXXXIV"), 84);
        assertEquals(RomanToDecimal.romanToDecimal("LXXXIV"), 84);
        assertEquals(RomanToDecimal.romanToDecimal("XCIV"), 94);
        assertEquals(RomanToDecimal.romanToDecimal("xciv"), 94);
        assertEquals(RomanToDecimal.romanToDecimal("XCIX"), 99);
        assertEquals(RomanToDecimal.romanToDecimal("xcix"), 99);
        assertEquals(RomanToDecimal.romanToDecimal("CCCXCIV"), 394);
        assertEquals(RomanToDecimal.romanToDecimal("cccxciv"), 394);
        assertEquals(RomanToDecimal.romanToDecimal("CDXCIV"), 494);
        assertEquals(RomanToDecimal.romanToDecimal("cdxciv"), 494);
        assertEquals(RomanToDecimal.romanToDecimal("CMXCIV"), 994);
        assertEquals(RomanToDecimal.romanToDecimal("cmxciv"), 994);
        assertEquals(RomanToDecimal.romanToDecimal("MCMLXII"), 1962);
        assertEquals(RomanToDecimal.romanToDecimal("mcmlxii"), 1962);
        assertEquals(RomanToDecimal.romanToDecimal("MMCDIX"), 2409);
        assertEquals(RomanToDecimal.romanToDecimal("mmcdix"), 2409);
        assertEquals(RomanToDecimal.romanToDecimal("MMCDXCIV"), 2494);
        assertEquals(RomanToDecimal.romanToDecimal("MMCDXCIV"), 2494);
        assertEquals(RomanToDecimal.romanToDecimal("CMXCIV"), 994);
        assertEquals(RomanToDecimal.romanToDecimal("cmxciv"), 994);
        assertEquals(RomanToDecimal.romanToDecimal("MMCMXCIX"), 2999);
        assertEquals(RomanToDecimal.romanToDecimal("mmcmxcix"), 2999);
        assertEquals(RomanToDecimal.romanToDecimal("IIVI"), 6);
        assertEquals(RomanToDecimal.romanToDecimal("iivi"), 6);
        assertEquals(RomanToDecimal.romanToDecimal("IIIVII"), 8);
        assertEquals(RomanToDecimal.romanToDecimal("iiivii"),8);
        assertEquals(RomanToDecimal.romanToDecimal("sweet_bruh"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("iiixviii"),19);
        assertEquals(RomanToDecimal.romanToDecimal("xmxviviiiiv"),1038);
        assertEquals(RomanToDecimal.romanToDecimal("MXMXVIVIXII"), 2042);
        assertEquals(RomanToDecimal.romanToDecimal("mxmxvivixii"),2042);
        assertEquals(RomanToDecimal.romanToDecimal("MMCCCDLXIIIVIX"),2677);
        assertEquals(RomanToDecimal.romanToDecimal("mmcccdlxiiivix"),2677);
        assertEquals(RomanToDecimal.romanToDecimal("MMMMCDCD"),5000);
        assertEquals(RomanToDecimal.romanToDecimal("mmmmcdcd"),5000);
        assertEquals(RomanToDecimal.romanToDecimal("I_am_Batman"),2001);
        assertEquals(RomanToDecimal.romanToDecimal("ISIS_is_not_a_valid_roman_numeral"),2609);
        assertEquals(RomanToDecimal.romanToDecimal("MMMMGood"),4500);
        assertEquals(RomanToDecimal.romanToDecimal("mmmmgood"), 4500);
        assertEquals(RomanToDecimal.romanToDecimal("MMCMLXIJMMCD"), 5561);
        assertEquals(RomanToDecimal.romanToDecimal("mmcmlxijmmcd"), 5561);
        assertEquals(RomanToDecimal.romanToDecimal("LXHID"), 561);
        assertEquals(RomanToDecimal.romanToDecimal("lxhid"), 561);
        assertEquals(RomanToDecimal.romanToDecimal("IVXLCDME"), 1444);
        assertEquals(RomanToDecimal.romanToDecimal("ivxlcdme"), 1444);
        assertEquals(RomanToDecimal.romanToDecimal("SWEET_BRUH"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("sweet_bruh"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("6502"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("ixic"), 110);
        assertEquals(RomanToDecimal.romanToDecimal("iiixiii"),14);
        assertEquals(RomanToDecimal.romanToDecimal("wus_poppin_b"),-1);
        assertEquals(RomanToDecimal.romanToDecimal("c++"),100);
        assertEquals(RomanToDecimal.romanToDecimal("can_i_break_it_with_the_following_string:@$%*)!^%@*)@!(*%!*))!@"), 205);
        assertEquals(RomanToDecimal.romanToDecimal("xxx_ben_browner_xxx"), 60);
        assertEquals(RomanToDecimal.romanToDecimal("parameterized_testing_is_really_cool"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("I_hate_eclipse"), 152);
    }
}