## Grandma's Cookbook ERD

**Entities and Attributes:**

| Entity           | Attributes                                        | 
| :-----------------:|:-------------:                                    | 
| Recipes            | Recipe_ID (Primary Key), Recipe_Name, Recipe_Type | 
| Recipe_Ingredients | Recipe_Ingredients_ID (Primary Key), ID_Recipe (Foreign Key), ID_Ingredient (Foreign Key) |         
| Ingredients        | Ingredient_ID (Primary Key), Name |

**ERD Cardinalities:**

| Entities                      | Relationship      | 
| :----------------------------:|:-------------:    | 
| Recipes to Recipe_Ingredients | One or more       |
| Recipe_Ingredients to Recipes | One to one        |
| Recipe_Ingredients to Ingredients | One or more  |
| Ingredients to Recipe_Ingredients | One to one |

 
