@InsertAndGetCustomerFeature
Feature: Insert and Get Customer

  Scenario: Register all customer
    Given have the following customer data:
      | id  | username  | password  | address                         | age |
      | 1   | budi      | 1234      | Jl. Sudirman Baru Blok A1 No.2  | 20  |
      | 2   | tono      | 5555jh    | Jl. Kuningan I No.2A            | 22  |
      | 3   | joko      | abc123    | Jl. Menara Tinggi Blok K1 No.5  | 24  |
    When register all the customers