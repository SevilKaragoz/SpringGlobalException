Why do we need a Global Exception Handler?
-- To manage exception handlers from a single place
-- To catch errors using an exception handler instead of using try-catch blocks
-- To ensure a consistent exception response format (e.g., for the frontend)

@RestControllerAdvice
In Spring Boot, this is a global exception handler that allows you to centrally catch errors from all controllers in a REST API project and return them as JSON.

jakarta.validation.Valid -> @Valid
-- This is a validation annotation.
Invalid data -> throws an exception ->  handled either by the global exception handler or Spring automatically returns a 400 response.

-----------------------------------------------------------------------------------------------------------

Global Exception Handler neden ihtiyaç duyuyoruz?

-- Exception Handler ları tek bir yerden yönetmek 
-- Try Catch ile hatayı yakalamak yerine exception Handler ile yakalamak
-- Aynı formatta exception response olması ( Ör : Frontend için )



@RestControllerAdvice
  Spring Boot’ta REST API projelerinde tüm controller’lardan gelen hataları merkezi olarak yakalayıp JSON ile döndürmeyi sağlayan global exception handler’dır.


jakarta.validation.Valid ->   @Valid  
-- Validation anotasyonudur.
Hatalı veri  ->  Exception fırlatır   ->  global exception handler veya Spring otomatik 400 döner.





