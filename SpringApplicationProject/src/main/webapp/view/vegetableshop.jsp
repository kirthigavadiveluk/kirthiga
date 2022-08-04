welcome to vegetable shop
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="/form/shop" method="POST">
<input type="hidden" name="shop" value="invoice">
  <input type="radio" name="Cucumber" value="rs50">Cucumber
<input type="radio" name="Brinjal" value="rs30">Brinjal
<input type="radio" name="Onion" value="rs20">Onion
<input type="submit" value="Next Shop....">
</form:form>
 