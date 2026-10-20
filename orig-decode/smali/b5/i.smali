.class public final synthetic Lb5/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(IILjava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb5/i;->a:I

    iput p2, p0, Lb5/i;->b:I

    iput-object p3, p0, Lb5/i;->c:Ljava/lang/String;

    iput-wide p4, p0, Lb5/i;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lb5/i;->c:Ljava/lang/String;

    iget-wide v1, p0, Lb5/i;->d:J

    iget v3, p0, Lb5/i;->a:I

    iget v4, p0, Lb5/i;->b:I

    invoke-static {v3, v4, v0, v1, v2}, Lcom/auto/accept/service/RideAcceptorService;->f(IILjava/lang/String;J)V

    return-void
.end method
