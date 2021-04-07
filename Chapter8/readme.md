# Action Handlers/Listeners
- Action Listeners are the listeners of the binded items.
- It is used as an interface ActionListener interface
- It needs to take a method called actionPerformed with ActionEvent.
- When a user trigger this action it calls listener.actionPerformed(event)

# Inner Classes
- In a gui application, an element might need some actions when specific actions occurs. In that case we use inner classes to handle those events.
- We can basically extend a class from a frame. Inside of that class we can create "aClass implements ActionListener" where the actionPerformed will be overriden.
# ActionListener
# WindowListener
# WindowAdapter
# JFrame
# Action Interface
- An interface to encapsulate commands to attach them to multiple event sources.
# AbstractAction
- putValue
- getValue
- Action. Enum parameters
# InputMap 
- -> creates a key name to attach a method
# ActionMap 
- -> get a method name to attach keys
---
Here are the most commonly used semantic event classes in the java.awt.event package:

- ActionEvent (for a button click, a menu selection, selecting a list item, or Enter typed in a text
field)
- AdjustmentEvent (the user adjusted a scrollbar)
- ItemEvent (the user made a selection from a set of checkbox or list items)

Five low-level event classes are commonly used:

- KeyEvent (a key was pressed or released)
- MouseEvent (the mouse button was pressed, released, moved, or dragged)
- MouseWheelEvent (the mouse wheel was rotated)
- FocusEvent (a component got focus or lost focus)
- WindowEvent (the window state changed)

The following interfaces listen to these events:
- ActionListener MouseMotionListener
- AdjustmentListener MouseWheelListener
- FocusListener WindowListener
- ItemListener WindowFocusListener
- KeyListener WindowStateListener
- MouseListener
Several of the AWT listener interfaces, namely those that have more than one method, come with a
companion adapter class that implements all the methods in the interface to do nothing. (The other
interfaces have only a single method each, so there is no benefit in having adapter classes for these
interfaces.) Here are the commonly used adapter classes:
Click here to view code image
- FocusAdapter MouseMotionAdapter
- KeyAdapter WindowAdapter
- MouseAdapter
