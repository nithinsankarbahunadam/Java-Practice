@RestController
@RequestMapping("/accounts")
public class AccountController {

    // GET /accounts
    @GetMapping
    public String getAllAccounts() {
        return "All accounts list";
    }

    // GET /accounts/5
    @GetMapping("/{id}")
    public String getAccount(@PathVariable int id) {
        return "Account details for ID: " + id;
    }

    // POST /accounts
    @PostMapping
    public String createAccount() {
        return "New account created";
    }

    // PUT /accounts/5
    @PutMapping("/{id}")
    public String updateAccount(@PathVariable int id) {
        return "Account " + id + " updated";
    }

    // DELETE /accounts/5
    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable int id) {
        return "Account " + id + " deleted";
    }
}
