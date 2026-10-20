.class public abstract Le8/r0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/nio/charset/Charset;

.field public static final b:Ls6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Le8/r0;->a:Ljava/nio/charset/Charset;

    sget-object v0, Le8/l1;->e:Ls6/c;

    sput-object v0, Le8/r0;->b:Ls6/c;

    return-void
.end method

.method public static a(Ljava/lang/String;Lx9/v;)Le8/j1;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x3a

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    sget-object v0, Le8/i1;->d:Ljava/util/BitSet;

    new-instance v0, Le8/j1;

    invoke-direct {v0, p0, v1, p1}, Le8/j1;-><init>(Ljava/lang/String;ZLe8/k1;)V

    return-object v0
.end method
