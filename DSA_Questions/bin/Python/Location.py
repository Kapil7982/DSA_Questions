import phonenumbers
from phonenumbers import geocoder, region_code_for_country_code

phone_number = phonenumbers.parse("+918302119329")
phone_number_1 = phonenumbers.parse("+12136574429")

print("\nPhone Number Location\n")

# Get country information
country_code = phonenumbers.region_code_for_number(phone_number)
country_name = geocoder.country_name_for_number(phone_number, "en")

print(geocoder.description_for_number(phone_number, "en"))
print(geocoder.description_for_number(phone_number_1, "en"))

# Get state information (if available)
state = None
for region in geocoder.description_for_number(phone_number, "en").split(","):
    if region.strip() != country_name:
        state = region.strip()
        break

print("Country:", country_name)
print("State:", state if state else "Not available")
