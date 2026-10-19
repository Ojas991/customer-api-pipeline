import unittest
from app import get_customer


class TestCustomerAPI(unittest.TestCase):

    def test_valid_customer(self):
        customer = get_customer(1)

        self.assertEqual(customer["id"], 1)
        self.assertEqual(customer["name"], "Rohit Kumar")
        self.assertEqual(customer["status"], "active")

    def test_invalid_customer(self):
        customer = get_customer(0)

        self.assertEqual(
            customer["error"],
            "Invalid customer ID"
        )


if __name__ == "__main__":
    unittest.main()