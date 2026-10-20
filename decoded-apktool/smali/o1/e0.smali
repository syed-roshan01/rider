.class public final Lo1/e0;
.super Lw8/c;


# instance fields
.field public a:Lm9/x1;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lo1/h0;

.field public d:I


# direct methods
.method public constructor <init>(Lo1/h0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lo1/e0;->c:Lo1/h0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lo1/e0;->b:Ljava/lang/Object;

    iget p1, p0, Lo1/e0;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo1/e0;->d:I

    const-wide/16 v0, 0x0

    const/4 p1, 0x0

    iget-object v2, p0, Lo1/e0;->c:Lo1/h0;

    invoke-virtual {v2, v0, v1, p1, p0}, Lo1/h0;->h(JLc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
