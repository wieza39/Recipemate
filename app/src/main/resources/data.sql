INSERT INTO recipemate.category (id, name)
VALUES (1, 'Italian Cuisine');
INSERT INTO recipemate.category (id, name)
VALUES (2, 'Asian Flavors');
INSERT INTO recipemate.category (id, name)
VALUES (3, 'Desserts');

INSERT INTO recipemate.recipe (category_id, created_at, id, updated_at, description, difficulty, name, time_consuming,
                               portion_count)
VALUES (1, '2023-01-01 12:00:00.000000', 1, '2023-01-01 14:30:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'MEDIUM',
        'Spaghetti Bolognese', '45', 3),
       (2, '2023-01-02 10:30:00.000000', 2, '2023-01-02 12:45:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'HARD', 'Dragon Roll Sushi',
        '60', 2),
       (3, '2023-01-03 15:20:00.000000', 3, '2023-01-03 17:10:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'EASY', 'Buttery Croissants',
        '120', 5),
       (1, '2023-01-04 09:45:00.000000', 4, '2023-01-04 11:30:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'MEDIUM',
        'Authentic Margherita Pizza', '30', 4),
       (2, '2023-01-05 14:15:00.000000', 5, '2023-01-05 16:00:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'EASY',
        'Teriyaki Chicken and Rice Bowl', '40', 2),
       (3, '2023-01-06 11:00:00.000000', 6, '2023-01-06 13:20:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'HARD',
        'Decadent Chocolate Mousse', '90', 6),
       (1, '2023-01-07 16:30:00.000000', 7, '2023-01-07 18:45:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'MEDIUM', 'Hearty Beef Lasagna',
        '75', 4),
       (2, '2023-01-08 12:45:00.000000', 8, '2023-01-08 14:15:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'EASY',
        'Soy-Ginger Glazed Salmon', '35', 2),
       (3, '2023-01-09 10:00:00.000000', 9, '2023-01-09 11:45:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'MEDIUM',
        'Cheesecake with Raspberries', '60', 3),
       (1, '2023-01-10 13:20:00.000000', 10, '2023-01-10 15:00:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'EASY',
        'Deluxe Vegetarian Pizza', '40', 4),
       (2, '2023-01-11 08:30:00.000000', 11, '2023-01-11 10:15:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'HARD',
        'Assorted Tempura Platter', '75', 5),
       (3, '2023-01-12 14:45:00.000000', 12, '2023-01-12 16:30:00.000000', '<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ac dolor eu elit interdum euismod.</p>
<p>Vestibulum vel turpis vel libero scelerisque ullamcorper eget sed lorem. Curabitur aliquet lectus vel massa iaculis, eu ultrices arcu convallis.</p>
<p>Praesent sit amet tortor eu elit convallis cursus. Nunc eu lectus sed justo pellentesque tincidunt. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>',
        'MEDIUM', 'Apple pie', '50',
        3);

-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (1, 'JohnDoe', 'johndoe123@test.com', 'pass123', 'Doe');
-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (2, 'JaneSmith', 'janesmith456@test.com', 'securepass', 'Smith');
-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (3, 'MichaelJohnson', 'michaelj567@test.com', 'password123', 'Johnson');
-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (4, 'EmilyWilliams', 'emilyw789@test.com', 'mysecretpassword', 'Williams');
-- INSERT INTO recipemate.user (id, first_name, email, password, second_name)
-- VALUES (5, 'DavidBrown', 'davidbrown0101@test.com', 'supersecurepass', 'Brown');

-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (4, 1, 1);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (5, 1, 2);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (3, 1, 3);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (4, 1, 4);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (5, 1, 5);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (3, 2, 1);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (4, 2, 2);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (5, 2, 3);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (3, 2, 4);
-- INSERT INTO recipemate.rate_recipe (value, recipe_id, user_id)
-- VALUES (4, 2, 5);

INSERT INTO recipemate.recipe_image (id, is_main, href, alt, title, recipe_id)
VALUES (1, true, 'https://images.unsplash.com/photo-1622973536968-3ead9e780960?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'danijela prijovic qits spaghetti', 'danijela prijovic qits spaghetti', 1),
       (2, false, 'https://images.unsplash.com/photo-1598866594230-a7c12756260f?q=80&w=2016&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'emanuel ekstrom spaghetti', 'emanuel ekstrom spaghetti', 1),
       (3, false, 'https://images.unsplash.com/photo-1595295333158-4742f28fbd85?q=80&w=2080&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'homescreenify spaghetti', 'homescreenify spaghetti', 1),
       (4, false, 'https://images.unsplash.com/photo-1607375658859-39f31567ce13?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'stefan schauberger spaghetti', 'stefan schauberger spaghetti', 1),

       (5, true, 'https://images.unsplash.com/photo-1617196034738-26c5f7c977ce?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'douglas-lopez sushi roll', 'douglas-lopez sushi roll', 2),
       (6, false, 'https://images.unsplash.com/photo-1617196034183-421b4917c92d?q=80&w=2088&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'flyd loB9 sushi roll', 'flyd loB9 sushi roll', 2),
       (7, false, 'https://images.unsplash.com/photo-1607301406259-dfb186e15de8?q=80&w=2111&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'jakub-dziubak sushi', 'jakub-dziubak sushi', 2),
       (8, false, 'https://images.unsplash.com/photo-1607301405418-780ee5e6dd10?q=80&w=1966&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'thomas-marban-EHK sushi roll', 'thomas-marban-EHK sushi roll', 2),

       (9, true, 'https://images.unsplash.com/photo-1599940778173-e276d4acb2bb?q=80&w=2055&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'conor brown croissant', 'conor brown croissant', 3),
       (10, false, 'https://plus.unsplash.com/premium_photo-1661288432140-96cfe29379fe?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'jocelyn-morales croissant', 'jocelyn-morales croissant', 3),
       (11, false, 'https://images.unsplash.com/photo-1623334044303-241021148842?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'mae-mu croissant', 'mae-mu croissant', 3),
       (12, false, 'https://images.unsplash.com/photo-1587912001191-0cd4f14fd89e?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'tom-paolini croissant', 'tom-paolini croissant', 3),

       (13, true, 'https://images.unsplash.com/photo-1604068549290-dea0e4a305ca?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'amirali-mirhashemian pizza margherita', 'amirali-mirhashemian pizza margherita', 4),
       (14, false, 'https://images.unsplash.com/photo-1571207133905-e63101f15248?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'aurelien-lemasson-theobald pizza margherita', 'aurelien-lemasson-theobald pizza margherita', 4),
       (15, false, 'https://images.unsplash.com/photo-1595854341625-f33ee10dbf94?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'louis-hansel pizza margherita', 'louis-hansel pizza margherita', 4),
       (16, false, 'https://images.unsplash.com/photo-1574071318508-1cdbab80d002?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'mahyar-mirghasemi pizza margherita', 'mahyar-mirghasemi pizza margherita', 4),

       (17, true, 'https://images.unsplash.com/photo-1636401870585-a8852371e84a?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'ca-creative teriyaki chicken', 'ca-creative teriyaki chicken', 5),
       (18, false, 'https://images.unsplash.com/photo-1564836235910-c3055ca0f912?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'fernando-aguilar teriyaki chicken', 'fernando-aguilar teriyaki chicken', 5),
       (19, false, 'https://images.unsplash.com/photo-1537543525161-3c93d0b61d7a?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'raman teriyaki chicken', 'raman teriyaki chicken', 5),
       (20, false, 'https://images.unsplash.com/photo-1519624014191-508652cbd7b5?q=80&w=1931&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'ryan-kwok teriyaki chicken', 'ryan-kwok teriyaki chicken', 5),

       (21, true, 'https://images.unsplash.com/photo-1590080875852-ba44f83ff2db?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'American Heritage Chocolate', 'American Heritage Chocolate', 6),
       (22, false, 'https://images.unsplash.com/photo-1607662256021-751dc3939f2b?q=80&w=2074&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'kisoulou chocolate mousse', 'kisoulou chocolate mousse', 6),
       (23, false, 'https://images.unsplash.com/photo-1588911550337-af627bab5d4f?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Mathilda Khoo mousse', 'Mathilda Khoo mousse', 6),
       (24, false, 'https://images.unsplash.com/photo-1596914255028-18a986e2dee7?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Teo Do Rio chocolate', 'Teo Do Rio chocolate', 6),

       (25, true, 'https://images.unsplash.com/photo-1636401870585-a8852371e84a?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Feyza Yıldırım lasagna', 'Feyza Yıldırım lasagna', 7),
       (26, false, 'https://images.unsplash.com/photo-1621510456681-2330135e5871?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Mateusz Feliksik lasagna', 'Mateusz Feliksik lasagna', 7),
       (27, false, 'https://images.unsplash.com/photo-1619895092538-128341789043?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'rabbit_in_blue lasagna', 'rabbit_in_blue lasagna', 7),
       (28, false, 'https://images.unsplash.com/photo-1546453570-d2fcacdafbb2?q=80&w=2052&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'sheri silver lasagna', 'sheri silver lasagna', 7),

       (29, true, 'https://images.unsplash.com/photo-1519708227418-c8fd9a32b7a2?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'CA Creative salmon', 'CA Creative salmon', 8),
       (30, false, 'https://images.unsplash.com/photo-1499125562588-29fb8a56b5d5?q=80&w=1932&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'CA Creative salmon raw', 'CA Creative salmon raw', 8),
       (31, false, 'https://images.unsplash.com/photo-1645120091968-5f24af8eaff5?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Collab Media fried salmon', 'Collab Media fried salmon', 8),
       (32, false, 'https://images.unsplash.com/photo-1676300185165-3f543c1fcb72?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Orkun Orcan salmon', 'Orkun Orcan salmon', 8),

       (33, true, 'https://images.unsplash.com/photo-1619985632461-f33748ef8f3e?q=80&w=1975&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'dekode cheese cake', 'dekode cheese cake', 9),
       (34, false, 'https://images.unsplash.com/photo-1621955511667-e2c316e4575d?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'kalisha ocheni cheese cake', 'kalisha ocheni cheese cake', 9),
       (35, false, 'https://images.unsplash.com/photo-1576721512413-5529a27701ff?q=80&w=2076&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'aimssimpson cheese cake', 'aimssimpson cheese cake', 9),
       (36, false, 'https://images.unsplash.com/photo-1611497438246-dcbb383de3c4?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'icsanti cheese cake', 'icsanti cheese cake', 9),

       (37, true, 'https://images.unsplash.com/photo-1551978129-b73f45d132eb?q=80&w=2017&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'sheri silver vegan pizza', 'sheri silver vegan pizza', 10),
       (38, false, 'https://images.unsplash.com/photo-1490717064594-3bd2c4081693?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'brenen vegan pizza', 'brenen vegan pizza', 10),
       (39, false, 'https://images.unsplash.com/photo-1489564239502-7a532064e1c2?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Cathal Mac an Bheatha oven', 'Cathal Mac an Bheatha oven', 10),
       (40, false, 'https://images.unsplash.com/photo-1621538997178-8acbbcd64506?q=80&w=2071&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'kajetan vegan pizza', 'kajetan vegan pizza', 10),

       (41, true, 'https://images.unsplash.com/photo-1593357849627-cbbc9fda6b05?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'baby abbas tempura', 'baby abbas tempura', 11),
       (42, false, 'https://images.unsplash.com/photo-1593357871477-00fd350cc0f8?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'baby abbas tempura plates', 'baby abbas tempura plates', 11),
       (43, false, 'https://images.unsplash.com/photo-1593357897684-3464383fe8f3?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'baby abbas tempura plates 2', 'baby abbas tempura plates 2', 11),
       (44, false, 'https://plus.unsplash.com/premium_photo-1666920184707-fb5cad772301?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'jsb co. tempura', 'jsb co. tempura', 11),

       (45, true, 'https://images.unsplash.com/photo-1562007908-859b4ba9a1a2?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'dilja96 apple pie', 'dilja96 apple pie', 12),
       (46, false, 'https://images.unsplash.com/photo-1562007908-69cf18a6da04?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'dilja96 apple pie 2', 'dilja96 apple pie 2', 12),
       (47, false, 'https://images.unsplash.com/photo-1584541305671-af4f46b4be2f?q=80&w=1930&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'ally p apple pie', 'ally p apple pie', 12),
       (48, false, 'https://images.unsplash.com/photo-1601000937490-4752ec5d905f?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'priscilla du preez apple pie christmas', 'priscilla du preez apple pie christmas', 12);

INSERT INTO recipemate.category_image (id, category_id, href, alt, title)
VALUES (1, 1, 'https://images.unsplash.com/photo-1498579150354-977475b7ea0b?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Italian Cuisine', 'Italian Cuisine'),
       (2, 2, 'https://images.unsplash.com/photo-1622643944007-450264a5f9a9?q=80&w=2044&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Asian Flavors', 'Asian Flavors'),
       (3, 3, 'https://images.unsplash.com/photo-1486427944299-d1955d23e34d?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Desserts', 'Desserts');

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