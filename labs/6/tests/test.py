from app import Romano
import unittest
import ddt

@ddt.ddt
class TestRomano(unittest.TestCase):
    @ddt.data(
        ('V', 5),
        ('IX', 9),
        ('II', 2),
        ('VII', 7),
    )
    @ddt.unpack
    def testMenores9(self, romano, natural):
        romano = Romano(romval=romano)
        natural_number = romano.romano_to_natural_number()
        self.assertEqual(natural_number, natural)
    
    @ddt.data(
        ('XXV', 25),
        ('LX', 60),
        ('XL', 40),
        ('XC', 90),
    )
    @ddt.unpack
    def testMenores99(self, romano, natural):
        romano = Romano(romval=romano)
        natural_number = romano.romano_to_natural_number()
        self.assertEqual(natural_number, natural)
    
    @ddt.data(
        ('CC', 200),
        ('CLX', 160),
        ('CXLII', 142),
        ('CVX', 105),
    )
    @ddt.unpack
    def testMenores200(self,romano, natural):
        romano = Romano(romval=romano)
        natural_number = romano.romano_to_natural_number()
        self.assertEqual(natural_number, natural)
