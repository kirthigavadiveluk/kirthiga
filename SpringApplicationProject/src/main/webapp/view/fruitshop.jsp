
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/form/shop" method="POST">
<input type="hidden" name="shop" value="vegetableshop">

  <input type="radio" name="apple" value="rs50">Apple
<input type="radio" name="mango" value="rs30">Mango
<input type="radio" name="orange" value="rs20">Orange
<input type="submit" value="Next Shop....">
</form:form>