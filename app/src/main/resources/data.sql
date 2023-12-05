INSERT INTO recipemate.category (id, name)
VALUES (1, 'Italian Cuisine');
INSERT INTO recipemate.category (id, name)
VALUES (2, 'Asian Flavors');
INSERT INTO recipemate.category (id, name)
VALUES (3, 'French Gastronomy');
INSERT INTO recipemate.category (id, name)
VALUES (4, 'Mexican Delights');
INSERT INTO recipemate.category (id, name)
VALUES (5, 'Healthy Recipes');
INSERT INTO recipemate.category (id, name)
VALUES (6, 'Bakery Specialties');
INSERT INTO recipemate.category (id, name)
VALUES (7, 'Seafood Extravaganza');
INSERT INTO recipemate.category (id, name)
VALUES (8, 'Vegetarian Delicacies');
INSERT INTO recipemate.category (id, name)
VALUES (9, 'Grilling Mastery');
INSERT INTO recipemate.category (id, name)
VALUES (10, 'Exotic Desserts');

INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name, time_consuming,
                               portion_count)
VALUES (1, '2023-01-01 12:00:00.000000', 1, '2023-01-01 14:30:00.000000', 'Delicious Pasta Dish', 1,
        'Spaghetti Bolognese', '45', 3),
       (2, '2023-01-02 10:30:00.000000', 2, '2023-01-02 12:45:00.000000', 'Sushi Masterpiece', 2, 'Dragon Roll Sushi',
        '60', 2),
       (3, '2023-01-03 15:20:00.000000', 3, '2023-01-03 17:10:00.000000', 'Classic Croissant', 0, 'Buttery Croissants',
        '120', 5),
       (1, '2023-01-04 09:45:00.000000', 4, '2023-01-04 11:30:00.000000', 'Pizza Margherita', 1,
        'Authentic Margherita Pizza', '30', 4),
       (2, '2023-01-05 14:15:00.000000', 5, '2023-01-05 16:00:00.000000', 'Teriyaki Chicken Bowl', 0,
        'Teriyaki Chicken and Rice Bowl', '40', 2),
       (3, '2023-01-06 11:00:00.000000', 6, '2023-01-06 13:20:00.000000', 'Chocolate Mousse', 2,
        'Decadent Chocolate Mousse', '90', 6),
       (1, '2023-01-07 16:30:00.000000', 7, '2023-01-07 18:45:00.000000', 'Lasagna Supreme', 1, 'Hearty Beef Lasagna',
        '75', 4),
       (2, '2023-01-08 12:45:00.000000', 8, '2023-01-08 14:15:00.000000', 'Soy-Ginger Salmon', 0,
        'Soy-Ginger Glazed Salmon', '35', 2),
       (3, '2023-01-09 10:00:00.000000', 9, '2023-01-09 11:45:00.000000', 'Almond Croissant', 1,
        'Flaky Almond Croissant', '60', 3),
       (1, '2023-01-10 13:20:00.000000', 10, '2023-01-10 15:00:00.000000', 'Vegetarian Pizza', 0,
        'Deluxe Vegetarian Pizza', '40', 4),
       (2, '2023-01-11 08:30:00.000000', 11, '2023-01-11 10:15:00.000000', 'Tempura Masterclass', 2,
        'Assorted Tempura Platter', '75', 5),
       (3, '2023-01-12 14:45:00.000000', 12, '2023-01-12 16:30:00.000000', 'Lemon Tart', 1, 'Zesty Lemon Tart', '50',
        3),
       (1, '2023-01-13 09:00:00.000000', 13, '2023-01-13 10:45:00.000000', 'Mushroom Risotto', 1,
        'Creamy Mushroom Risotto', '55', 4),
       (2, '2023-01-14 15:10:00.000000', 14, '2023-01-14 17:00:00.000000', 'Homemade Ramen', 2, 'Rich Tonkotsu Ramen',
        '90', 2),
       (3, '2023-01-15 11:30:00.000000', 15, '2023-01-15 13:15:00.000000', 'Classic Baguette', 0,
        'Crusty French Baguette', '45', 6),
       (1, '2023-01-16 16:00:00.000000', 16, '2023-01-16 17:45:00.000000', 'Caprese Salad', 0, 'Fresh Caprese Salad',
        '20', 2),
       (2, '2023-01-17 12:20:00.000000', 17, '2023-01-17 14:00:00.000000', 'Chicken Parmesan', 1,
        'Classic Chicken Parmesan', '60', 4),
       (3, '2023-01-18 08:45:00.000000', 18, '2023-01-18 10:30:00.000000', 'Berry Smoothie Bowl', 0,
        'Antioxidant-Packed Smoothie Bowl', '15', 1),
       (1, '2023-01-19 14:10:00.000000', 19, '2023-01-19 15:45:00.000000', 'Gourmet Grilled Cheese', 0,
        'Truffle-Infused Grilled Cheese', '25', 2),
       (2, '2023-01-20 10:30:00.000000', 20, '2023-01-20 12:15:00.000000', 'Mango Sorbet', 0, 'Refreshing Mango Sorbet',
        '30', 3);


INSERT INTO recipemate.user (id, first_name, login, password, second_name)
VALUES (1, 'JohnDoe', 'johndoe123', 'pass123', 'Doe');
INSERT INTO recipemate.user (id, first_name, login, password, second_name)
VALUES (2, 'JaneSmith', 'janesmith456', 'securepass', 'Smith');
INSERT INTO recipemate.user (id, first_name, login, password, second_name)
VALUES (3, 'MichaelJohnson', 'michaelj567', 'password123', 'Johnson');
INSERT INTO recipemate.user (id, first_name, login, password, second_name)
VALUES (4, 'EmilyWilliams', 'emilyw789', 'mysecretpassword', 'Williams');
INSERT INTO recipemate.user (id, first_name, login, password, second_name)
VALUES (5, 'DavidBrown', 'davidbrown0101', 'supersecurepass', 'Brown');

INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (4, 1, 1);
INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (5, 1, 2);
INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (3, 1, 3);
INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (4, 1, 4);
INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (5, 1, 5);
INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (3, 2, 1);
INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (4, 2, 2);
INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (5, 2, 3);
INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (3, 2, 4);
INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
VALUES (4, 2, 5);

INSERT INTO recipemate.recipe_image (id, is_main, name, alt, title, recipe_id)
VALUES (1, true, 'Main Image 1', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 1),
       (2, false, 'Main Image 2', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 1),
       (3, false, 'Main Image 3', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 1),
       (4, true, 'Main Image 4', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 2),
       (5, false, 'Main Image 5', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 2),
       (6, false, 'Main Image 6', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 3),
       (7, true, 'Main Image 7', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 3),
       (8, true, 'Main Image 8', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 4),
       (9, true, 'Main Image 9', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 5),
       (10, true, 'Main Image 10', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title', 6);

INSERT INTO ingredient (id, name)
VALUES (1, 'Tomato'),
       (2, 'Pasta'),
       (3, 'Tomato'),
       (4, 'Onion'),
       (5, 'Garlic'),
       (6, 'Basil'),
       (7, 'Olive Oil'),
       (8, 'Mozzarella'),
       (9, 'Salt'),
       (10, 'Pepper');

INSERT INTO measure (id, name)
VALUES (1, 'cups'),
       (2, 'grams'),
       (3, 'units'),
       (4, 'medium'),
       (5, 'cloves'),
       (6, 'tablespoon'),
       (7, 'teaspoon'),
       (8, 'bunch');

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (3, 1, 1, 1),   -- 1 'cups'
       (200, 2, 1, 2), -- 2 'grams'
       (2, 3, 1, 3),   -- 3 'units'
       (1, 4, 1, 4),   -- 4 'medium'
       (50, 5, 1, 2),  -- 2 'grams'
       (2, 6, 1, 5),   -- 5 'cloves'
       (1, 7, 1, 6),   -- 6 'tablespoon'
       (100, 8, 1, 2), -- 2 'grams'
       (1, 9, 1, 7),   -- 7 'teaspoon'
       (1, 10, 1, 7); -- 7 'teaspoon'

INSERT INTO recipe_ingredient (count, ingredient_id, recipe_id, measure_id)
VALUES (2, 4, 2, 3),   -- 3 'units'
       (150, 5, 2, 2), -- 2 'grams'
       (1, 6, 2, 8),   -- 8 'bunch'
       (3, 7, 2, 6),   -- 6 'tablespoons'
       (200, 8, 2, 2), -- 2 'grams'
       (2, 9, 2, 7),   -- 7 'teaspoons'
       (1, 10, 2, 7),  -- 7 'teaspoon'
       (4, 1, 2, 1),   -- 1 'cups'
       (250, 2, 2, 2), -- 2 'grams'
       (3, 3, 2, 3);
-- 3 'units'

-- Insert records into the recipe_step table
INSERT INTO recipe_step (step_order, title, description, recipe_id)
VALUES (1, 'Step 1', 'Description for step 1 for Product 1', 1),
       (2, 'Step 2', 'Description for step 2 for Product 1', 1),
       (3, 'Step 3', 'Description for step 3 for Product 1', 1),

       (1, 'Step 1', 'Description for step 1 for Product 2', 2),
       (2, 'Step 2', 'Description for step 2 for Product 2', 2),
       (3, 'Step 3', 'Description for step 3 for Product 2', 2),

       (1, 'Step 1', 'Description for step 1 for Product 3', 3),
       (2, 'Step 2', 'Description for step 2 for Product 3', 3),
       (3, 'Step 3', 'Description for step 3 for Product 3', 3),

       (1, 'Step 1', 'Description for step 1 for Product 4', 4),
       (2, 'Step 2', 'Description for step 2 for Product 4', 4),
       (3, 'Step 3', 'Description for step 3 for Product 4', 4),

       (1, 'Step 1', 'Description for step 1 for Product 5', 5),
       (2, 'Step 2', 'Description for step 2 for Product 5', 5),
       (3, 'Step 3', 'Description for step 3 for Product 5', 5);