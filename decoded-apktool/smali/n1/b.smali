.class public final Ln1/b;
.super Lw8/c;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ln1/d;

.field public c:I


# direct methods
.method public constructor <init>(Ln1/d;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln1/b;->b:Ln1/d;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ln1/b;->a:Ljava/lang/Object;

    iget p1, p0, Ln1/b;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln1/b;->c:I

    iget-object v0, p0, Ln1/b;->b:Ln1/d;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ln1/d;->a(JJLu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
