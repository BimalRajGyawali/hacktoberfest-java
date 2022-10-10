## Displaying graphics in Swing/AWT:

`java.awt.Graphics` class provides many methods for graphics programming.

### Commonly used methods of Graphics class:
* `public abstract void drawString(String str, int x, int y)`: is used to draw the specified string.
* `public void drawRect(int x, int y, int width, int height)`: draws a rectangle with the specified width and height.
* `public abstract void fillRect(int x, int y, int width, int height)`: is used to fill rectangle with the default color and specified width and height.
* `public abstract void drawOval(int x, int y, int width, int height)`: is used to draw oval with the specified width and height.
* `public abstract void fillOval(int x, int y, int width, int height)`: is used to fill oval with the default color and specified width and height.
* `public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)`: is used draw a circular or elliptical arc.
* `public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)`: is used to fill a circular or elliptical arc.
* `public abstract void setColor(Color c)`: is used to set the graphics current color to the specified color.
* `public abstract void setFont(Font font)`: is used to set the graphics current font to the specified font.
* `public abstract void	drawPolygon(int[] xPoints, int[] yPoints, int nPoints)`Draws a closed polygon defined by arrays of x and y coordinates.
* `public void	drawPolygon(Polygon p)`
Draws the outline of a polygon defined by the specified Polygon object.
* `public abstract void	drawPolyline(int[] xPoints, int[] yPoints, int nPoints)`Draws a sequence of connected lines defined by arrays of x and y coordinates.

## Polygon
The Polygon class encapsulates a description of a closed, two-dimensional region within a coordinate space. This region is bounded by an arbitrary number of line segments, each of which is one side of the polygon. Internally, a polygon comprises of a list of (x,y) coordinate pairs, where each pair defines a vertex of the polygon, and two successive pairs are the endpoints of a line that is a side of the polygon. The first and final pairs of (x,y) points are joined by a line segment that closes the polygon.

### Fields:
* `protected Rectangle	bounds`
The bounds of this Polygon.
* `int	npoints`
The total number of points.

* `int[]	xpoints`
The array of X coordinates.

* `int[]	ypoints`
The array of Y coordinates.
## Constructor:
* `public Polygon()`
Creates an empty polygon.
* `Polygon(int[] xpoints, int[] ypoints, int npoints)`
Constructs and initializes a Polygon from the specified parameters.
## Common Methods:
* `public void	addPoint(int x, int y)`
Appends the specified coordinates to this Polygon.
