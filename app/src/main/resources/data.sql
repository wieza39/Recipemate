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

INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (1, '2023-01-01 12:00:00.000000', 1, '2023-01-01 14:30:00.000000', 'Delicious Pasta Dish', 'Medium',
        'Spaghetti Bolognese', '1. Boil pasta. 2. Prepare Bolognese sauce. 3. Combine and serve.', '45');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (2, '2023-01-02 10:30:00.000000', 2, '2023-01-02 12:45:00.000000', 'Sushi Masterpiece', 'Hard',
        'Dragon Roll Sushi', '1. Prepare sushi rice. 2. Assemble sushi ingredients. 3. Roll and cut.', '60');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (3, '2023-01-03 15:20:00.000000', 3, '2023-01-03 17:10:00.000000', 'Classic Croissant', 'Easy',
        'Buttery Croissants', '1. Make croissant dough. 2. Shape and bake. 3. Enjoy flaky goodness.', '120');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (1, '2023-01-04 09:45:00.000000', 4, '2023-01-04 11:30:00.000000', 'Pizza Margherita', 'Medium',
        'Authentic Margherita Pizza',
        '1. Prepare pizza dough. 2. Add tomato sauce and toppings. 3. Bake to perfection.', '30');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (2, '2023-01-05 14:15:00.000000', 5, '2023-01-05 16:00:00.000000', 'Teriyaki Chicken Bowl', 'Easy',
        'Teriyaki Chicken and Rice Bowl', '1. Cook teriyaki chicken. 2. Prepare rice. 3. Assemble the bowl.', '40');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (3, '2023-01-06 11:00:00.000000', 6, '2023-01-06 13:20:00.000000', 'Chocolate Mousse', 'Hard',
        'Decadent Chocolate Mousse', '1. Melt chocolate. 2. Whip cream. 3. Combine and chill.', '90');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (1, '2023-01-07 16:30:00.000000', 7, '2023-01-07 18:45:00.000000', 'Lasagna Supreme', 'Medium',
        'Hearty Beef Lasagna', '1. Cook meat sauce. 2. Layer with pasta and cheese. 3. Bake to golden perfection.',
        '75');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (2, '2023-01-08 12:45:00.000000', 8, '2023-01-08 14:15:00.000000', 'Soy-Ginger Salmon', 'Easy',
        'Soy-Ginger Glazed Salmon', '1. Marinate salmon. 2. Grill or bake. 3. Serve with vegetables.', '35');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (3, '2023-01-09 10:00:00.000000', 9, '2023-01-09 11:45:00.000000', 'Almond Croissant', 'Medium',
        'Flaky Almond Croissant', '1. Prepare almond filling. 2. Shape croissants. 3. Bake and glaze.', '60');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (1, '2023-01-10 13:20:00.000000', 10, '2023-01-10 15:00:00.000000', 'Vegetarian Pizza', 'Easy',
        'Deluxe Vegetarian Pizza',
        '1. Prepare pizza dough. 2. Add tomato sauce and a variety of veggies. 3. Bake until bubbly.', '40');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (2, '2023-01-11 08:30:00.000000', 11, '2023-01-11 10:15:00.000000', 'Tempura Masterclass', 'Hard',
        'Assorted Tempura Platter',
        '1. Mix tempura batter. 2. Dip and fry various ingredients. 3. Enjoy crispy tempura.', '75');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (3, '2023-01-12 14:45:00.000000', 12, '2023-01-12 16:30:00.000000', 'Lemon Tart', 'Medium', 'Zesty Lemon Tart',
        '1. Prepare tart crust. 2. Make lemon curd. 3. Bake and garnish.', '50');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (1, '2023-01-13 09:00:00.000000', 13, '2023-01-13 10:45:00.000000', 'Mushroom Risotto', 'Medium',
        'Creamy Mushroom Risotto',
        '1. Sauté mushrooms and onions. 2. Add Arborio rice and broth. 3. Stir until creamy.', '55');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (2, '2023-01-14 15:10:00.000000', 14, '2023-01-14 17:00:00.000000', 'Homemade Ramen', 'Hard',
        'Rich Tonkotsu Ramen', '1. Make pork broth. 2. Prepare ramen noodles and toppings. 3. Assemble and slurp.',
        '90');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (3, '2023-01-15 11:30:00.000000', 15, '2023-01-15 13:15:00.000000', 'Classic Baguette', 'Easy',
        'Crusty French Baguette', '1. Mix and knead dough. 2. Shape into baguette. 3. Bake until golden brown.', '45');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (1, '2023-01-16 16:00:00.000000', 16, '2023-01-16 17:45:00.000000', 'Caprese Salad', 'Easy',
        'Fresh Caprese Salad',
        '1. Slice tomatoes and mozzarella. 2. Arrange on a plate. 3. Drizzle with balsamic glaze.', '20');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (2, '2023-01-17 12:20:00.000000', 17, '2023-01-17 14:00:00.000000', 'Chicken Parmesan', 'Medium',
        'Classic Chicken Parmesan',
        '1. Bread and fry chicken. 2. Top with marinara sauce and cheese. 3. Bake until bubbly.', '60');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (3, '2023-01-18 08:45:00.000000', 18, '2023-01-18 10:30:00.000000', 'Berry Smoothie Bowl', 'Easy',
        'Antioxidant-Packed Smoothie Bowl', '1. Blend berries and yogurt. 2. Pour into a bowl. 3. Add toppings.', '15');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (1, '2023-01-19 14:10:00.000000', 19, '2023-01-19 15:45:00.000000', 'Gourmet Grilled Cheese', 'Easy',
        'Truffle-Infused Grilled Cheese',
        '1. Butter bread. 2. Add truffle-infused cheese. 3. Grill until golden and melty.', '25');
INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name,
                               steps_descriptions, time_consuming)
VALUES (2, '2023-01-20 10:30:00.000000', 20, '2023-01-20 12:15:00.000000', 'Mango Sorbet', 'Easy',
        'Refreshing Mango Sorbet', '1. Blend mangoes. 2. Freeze until firm. 3. Scoop and enjoy.', '30');

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

INSERT INTO recipe_image (image_id, recipe_id, is_main, name, alt, title)
VALUES (1, 1, true, 'Main Image 1', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title'),
       (2, 2, true, 'Main Image 2', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title'),
       (3, 3, true, 'Main Image 3', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title'),
       (4, 4, true, 'Main Image 4', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title'),
       (5, 5, true, 'Main Image 5', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title'),
       (6, 6, true, 'Main Image 6', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title'),
       (7, 7, true, 'Main Image 7', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title'),
       (8, 8, true, 'Main Image 8', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title'),
       (9, 9, true, 'Main Image 9', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title'),
       (10, 10, true, 'Main Image 10', 'Spaghetti Bolognese Alt', 'Spaghetti Bolognese Title');
