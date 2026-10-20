.class public final Lea/j;
.super Laa/a;


# instance fields
.field public final synthetic e:Lea/r;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lea/r;II)V
    .locals 0

    iput-object p2, p0, Lea/j;->e:Lea/r;

    iput p3, p0, Lea/j;->f:I

    iput p4, p0, Lea/j;->g:I

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Laa/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    iget v0, p0, Lea/j;->f:I

    iget v1, p0, Lea/j;->g:I

    iget-object v2, p0, Lea/j;->e:Lea/r;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v3, v2, Lea/r;->F:Lea/z;

    const/4 v4, 0x1

    invoke-virtual {v3, v0, v4, v1}, Lea/z;->X(IZI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v2, v0}, Lea/r;->b(Ljava/io/IOException;)V

    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
