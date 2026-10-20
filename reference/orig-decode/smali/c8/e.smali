.class public final Lc8/e;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lb8/b;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final synthetic e:Ll/z2;


# direct methods
.method public constructor <init>(Ll/z2;Lb8/b;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/e;->e:Ll/z2;

    iput-object p2, p0, Lc8/e;->a:Lb8/b;

    iput p3, p0, Lc8/e;->b:I

    iput p4, p0, Lc8/e;->c:I

    iput p5, p0, Lc8/e;->d:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    sget-object v0, Lb8/b;->e:Lb8/b;

    iget-object v1, p0, Lc8/e;->a:Lb8/b;

    iget v2, p0, Lc8/e;->d:I

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lc8/e;->e:Ll/z2;

    iget-object v0, v0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Ll4/e;

    iget-object v1, v0, Ll4/e;->c:Ljava/lang/Object;

    check-cast v1, Lz7/d;

    iget-object v0, v0, Ll4/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v3, p0, Lc8/e;->b:I

    add-int/2addr v2, v3

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v1, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    iget v2, p0, Lc8/e;->c:I

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v2, v0

    :cond_0
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lc8/e;->a:Lb8/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v2, Lb8/b;->f:Lb8/b;

    iget-object v3, p0, Lc8/e;->e:Ll/z2;

    if-ne v1, v2, :cond_0

    iget-object v1, v3, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ll4/e;

    iget-object v1, v1, Ll4/e;->c:Ljava/lang/Object;

    check-cast v1, Lz7/d;

    iget-object v1, v1, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    iget v2, p0, Lc8/e;->c:I

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_0
    iget-object v1, v3, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ll4/e;

    iget-object v1, v1, Ll4/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget v2, p0, Lc8/e;->b:I

    iget v3, p0, Lc8/e;->d:I

    add-int/2addr v3, v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_3

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x20

    if-lt v4, v5, :cond_2

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x7e

    if-le v4, v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    :goto_1
    const/16 v4, 0x2e

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
