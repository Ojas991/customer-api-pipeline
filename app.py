def get_customer(customer_id):
    if customer_id <= 0:
        return {"error": "Invalid customer ID"}

    return {
        "id": customer_id,
        "name": "Rohit Kumar",
        "status": "active"
    }


if __name__ == "__main__":
    print("Customer API started")
    print(get_customer(1))