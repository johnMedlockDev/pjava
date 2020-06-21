/*create trigger named tgrExcessInventory */

CREATE TRIGGER tgrExcessInventory

/*table is Production.ProductInventory */

on Production.ProductInventory

FOR UPDATE

AS

IF EXISTS

(SELECT 'True'

/* create object i for insert and d for delete.*/

FROM Inserted i

JOIN Deleted d

ON i.productID = d.ProductID

AND i.locationID = d.LocationID

/*check whether quantity never exceed 800 unit*/

WHERE (d.quantity + i.quantity) >= 800 OR

i.quantity >=800

)

BEGIN

/*check for the error and print the error*/

RAISERROR('Cannot increase stock where units would be over 800 units',16,1)

/*Transcation is done rollback means not saved*/

ROLLBACK TRAN

END