<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <body>
  <h2>Taker Information</h2>
  <table border="1">
    <tr bgcolor="#9acd32">
      <th>Name</th>
      <th>Department</th>
      <th>Order Number</th>
      <th>Rank</th>
    </tr>
    <xsl:for-each select="personalInformation/personal">
    <tr>
      <td><xsl:value-of select="@name"/></td>
      <td><xsl:value-of select="department"/></td>
      <td><xsl:value-of select="order_number"/></td>
      <td><xsl:value-of select="take_date"/></td>
    </tr>
    </xsl:for-each>
  </table>
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>
