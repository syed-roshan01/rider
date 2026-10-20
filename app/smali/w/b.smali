.class public final Lw/b;
.super Lw8/c;


# instance fields
.field public a:Lc9/c;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lw/h;

.field public d:I


# direct methods
.method public constructor <init>(Lw/h;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lw/b;->c:Lw/h;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lw/b;->b:Ljava/lang/Object;

    iget p1, p0, Lw/b;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw/b;->d:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lw/b;->c:Lw/h;

    invoke-virtual {v1, p1, v0, p1, p0}, Lw/h;->c(Lv/h2;FLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
